package com.performance.module_3_167

class Feature167UseCase1(
    private val repository: Feature167Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
