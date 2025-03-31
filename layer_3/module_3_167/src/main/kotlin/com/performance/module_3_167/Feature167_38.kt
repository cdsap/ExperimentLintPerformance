package com.performance.module_3_167

class Feature167UseCase2(
    private val repository: Feature167Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
