package com.performance.module_1_173

class Feature173UseCase2(
    private val repository: Feature173Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
