package com.performance.module_3_266

class Feature266UseCase1(
    private val repository: Feature266Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
