package com.performance.module_3_167

class Feature167UseCase0(
    private val repository: Feature167Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
